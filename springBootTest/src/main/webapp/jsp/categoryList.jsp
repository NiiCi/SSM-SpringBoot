<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width",initial-scale=1.0,maximum-scale=1.0,                                       
user-scalable=no"/>
	<link rel="stylesheet" href="css/bootstrap-2.3.2.css" />	
	<script src="js/jquery-1.8.3.js" type="text/javascript" charset="UTF-8"></script>
	<script src="js/bootstrap-2.3.2.js" type="text/javascript" charset="UTF-8"></script>
	<script src="My97DatePicker/WdatePicker.js" type="text/javascript" charset="UTF-8"></script>
<title>Insert title here</title>
<style type="text/css">
			input{
				width:150px;
				}
		/* 	select{
				width:165px;
			} */
		</style>
</head>
<body>
 	 <%-- <%@ include file="session.jsp" %> --%>
		<div class="container">
			<%@include file="head.jsp" %>

			<div class="row">
				<%@ include file="left.jsp" %>
				

				<div class="span10">
					<form class="form-search" style="margin-left:50px;">
						<input class="input-medium search-query" type="text" />
						<button type="submit" class="btn btn-default">查找</button>
						<a id="#edit" href="#edit" role="button" class="btn btn-primary" data-toggle="modal">新增</a>
				</form>
			
				
			<!--模态框 -->
			<div id="edit" class="modal hide fade" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-header">
					 <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
					<h4 id="myModalLabel">
						
					</h4>
				</div>
					<div class="modal-body">
					<form id="myform" action="UserServlet" method="post" class="form-horizontal">
					    <fieldset>
					 		<div class="control-group">
					          <label class="control-label" for="cgid">类别编号:</label>
					          <div class="controls">
					            <input id="cgid" name="categoryID" type="text" placeholder="" readonly="readonly">
					           
					          </div>
					        </div>
					        <div class="control-group">
					          <label class="control-label" for="cgname">类别名称:</label>
					          <div class="controls">
					            <input id="cgname" name="category_name" type="text" placeholder="">
					             <span ></span>
					          </div>
					        </div>
					        <div class="control-group">
					          <label class="control-label" for="cgdesc">类别描述:</label>
					          <div class="controls">
					            <input id="cgdesc" name="category_desc"  type="text" placeholder="">
					             <span ></span>
					          </div>
					        </div>
								<div class="modal-footer">
									<button class="btn" data-dismiss="modal" aria-hidden="true">关闭</button>
									<button type="button" class="btn btn-primary save">保存</button>
								</div>

							</fieldset>
					  </form>
					</div>
					</div>
					<table class="table" data-toggle="table">
						<thead>
							<tr>
								<th>
									类别编号
								</th>
								<th>
									类别名称
								</th>
								<th>
									类别描述
								</th>
								<th>
									操作
								</th>
							</tr>
						</thead>
						<tbody>
						</tbody>
					</table>
					<div class="pagination text-right">
						<ul id="pages">
						</ul>
					</div>
				</div>
			</div>
			<div class="row-fluid">
				<div class="span12">
				</div>
			</div>
		</div>
	</body>
	
	<script type="text/javascript">	
		var $update;
		$(document).ready(function(){
			getData(1);
		});
		//Ajax 查询数据
		var pages;
		function getData(pageIndex){
			pages = pageIndex;
			$.ajax({
				type:"get",
				url:"categoryController",
				data:{"pageIndex":pageIndex},
				success:function(result){
					showData(result);
					showPage(result);
				}
			});
		}
		
		
		//解析并显示数据
		function showData(Json){
			console.log(Json.list);
			$("tbody").empty();
			$.each(Json.list,function(index,item){
				var $tr = $("<tr>"+
						"<td>"+item.categoryID+"</td>"+
						"<td>"+item.category_name+"</td>"+
						"<td>"+item.category_desc+"</td>"+
		                "<td>"+
		                	"<input type='button' id='#edit' href='#edit' class='btn btn-success btn-small' data-toggle='modal' value='修改'/>"+
		              	  	" <a href='#' role='button' class='btn btn-warning btn-small del' >删除</a>"+
		                "</td></tr>");
				$("tbody").append($tr);
				$("tbody tr:odd").removeClass();
				$("tbody tr:even").addClass("info");
			});
			
			//Ajax 删除数据
			$(".del").click(function delData(){
				var id = $(this).parent().parent().find("td").eq(0).text();
				if(confirm("您确定要删除此类别吗?")){
					$.ajax({
						type:"delete",
						url:"categoryController/"+id,
						success:function(flag){
							if (flag == "error") {
								alert("有商品存放在该分类中不能删除！");
							}else if(flag == "success"){
								alert("删除成功！");
								if (Json.list.length == 1) {
									getData(pages - 1);
								}else{
									getData(pages);
								}
							}
						}
					});
				}
			});
			
			//点击修改,将表单td中的内容赋值到模态框中
			
			$("[value='修改']").click(function (){
				$(".control-group").find("span").html("");
				$("#myModalLabel").html($(this).prop("value")+"类别");
				$(".control-group").eq(0).show();
				$update = $(this);
				$.each($(".form-horizontal .controls :input:not(:radio)"),
					function(index,item) {
						$(this).removeAttr("disabled");
						item.value = $update.parent().parent().find("td").eq(index).text();
					}
				);
			});
		}
		
		
		//解析并显示分页导航
		function showPage(Json){
			var pageCount = Json.pages;
			var pageIndex = Json.pageNum;
			var cgList = Json.list;
			$("#pages").empty();
			//上一页
			if(pageIndex-1>=1){
				$("#pages").append("<li><a title='"+(pageIndex-1)+"'>上一页</a></li>");
			}
			//当前页
			$.each(Json.navigatepageNums,function(index,item){
				if (item == pageIndex) {
					$("#pages").append("<li><a name='currPage' style='color:red' title='"+item+"'>"+item+"</a></li>");
				}else{
					$("#pages").append("<li><a name='currPage'  title='"+item+"'>"+item+"</a></li>");
				}
			});
			//下一页
			if(pageIndex+1<=pageCount){
				$("#pages").append("<li><a title='"+(pageIndex+1)+"'>下一页</a></li>");
			}
			$("#pages").find("a").click(function(){
				getData($(this).attr("title"));
			});
		}
		
		
		
		
			
		//点击关闭,清空模态框中的内容
		$("[data-dismiss='modal']").click(function(){
			$(".form-horizontal :input:not(:radio)").val("");
		});
		
		//点击新增
		$(".form-search a").click(function(){
			$(".form-horizontal .controls :input").removeAttr("disabled");
			$(".form-horizontal :input:not(:radio)").val("");
			$("#myModalLabel").html($(this).text()+"类别");
			$(".control-group").eq(0).find("input").val("0");
			$(".control-group").eq(0).hide();
			$(".control-group").find("span").html("");
		});
		//新增判断用户名是否存在;
		var flag;
		$("#cgname").blur(function (){
			$.ajax({
				type:"get",
				url:"CategoryServlet",
				data:{"name":$(this).val()},
				success:function(result){
					if (result == "error") {
						alert("该类别已存在");
						flag = true;
					}else {
						flag = false;
					}
				}
			});	
		});
		
		//Ajax提交
		 $(".save").click(function saveData(){
			if($("#myModalLabel").html() == "修改类别"){
				$.each($(".form-horizontal .controls :input"),
					function(index,item){
						if(index > 0){
							if(item.value == $update.parent().parent().find("td").eq(index).text()){
								$(item).attr("disabled","disabled");
							}
						}
					}
				);
				if($("[disabled='disabled']").length == 2){
					alert("请修改后再提交");
					$(".form-horizontal .controls :input").removeAttr("disabled");
					return false;
				}else{	
					//Ajax 修改数据
					console.log($("#myform").find("input").eq(1).val());
					console.log($("#myform").find("input").eq(2).val());
					$.ajax({
						type:"put",
						url:"categoryController",
						data:$("#myform").serialize(),
						success:function(result){	
							console.log(result);
							$.each(result,function(index,item){
								console.log(item);
								$(".control-group").find("span").eq(index-2).html(item).css({"color":"red","font-size":"12px"});
							});
							if (result == "success") {								
								alert("修改成功");
								getData(pages);
								$(".control-group").find("span").html("");
								$("#edit").modal("hide");
							}else{
								alert("修改失败");
							}
						}	
					});
				}
			}else{
					var name = $("#cgname").val();
					var pwd = $("#cgdesc").val();
					console.log(flag);
			/* 		if (name == "") {
						alert("请输入类别名称");
						return;
					}
					else if (pwd == "") {
						alert("请输入类别描述");
						return;
					}
					else if(flag){
						alert("类别已存在无法提交");
						$("#edit").modal("hide");
						return;
					}else{ */
						//Ajax 新增数据
						$.ajax({
							type:"post",
							url:"categoryController",
							data:$("#myform").serialize(),
							success:function(result){	
								$.each(result,function(index,item){
									console.log(item);
									$(".control-group").find("span").eq(index-2).html(item).css({"color":"red","font-size":"12px"});
								});
								if (result == "success") {								
									alert("新增成功");
									getData(pages);
									$(".control-group").find("span").html("");
									$("#edit").modal("hide");
								}else{
									alert("新增失败");
								}
							}	
						});
						}
		 		/* 	} */
		});
	
		

	</script>
</html>