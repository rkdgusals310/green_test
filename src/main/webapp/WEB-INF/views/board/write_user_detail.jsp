<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include  file="../inc/login_header.jsp" %>


<div class="container">
  <h2>Feel In Like</h2>

  <ul class="nav nav-tabs">
    <li class="active tab_write"><a  href="home.html">홈</a></li>
    <li class="tab_write"><a  href="home.html#menu1">공지사항</a></li>
    <li class="tab_write"><a  href="home.html#menu2">내 문의내역</a></li>
  </ul>

  <div class="container"  style="margin-top:5%; min-height:500px">
    <h3>게시글</h3> 	
    <p>${queDetail.user_name}님의 게시글입니다</p>				
    			
    <div class="panel"  >
      <div  class="panel-body">
        <span class="glyphicon glyphicon-plus">  제목</span> 
         <p>${queDetail.board_title}</p>
      </div>	
    </div>
    <div class="panel"  >
      <div  class="panel-body">
        <span class="glyphicon glyphicon-plus">  내용</span>
        <p>${queDetail.board_content}</p>
      </div> 
    </div>
    
    <div class="panel"  >
      <div  class="panel-body">
        <span class="glyphicon glyphicon-plus">  답변</span>
        <p>${queDetail.macro_content}</p>
      </div> 
    </div>	
    <div class="text-right"    >
       <a href="${pageContext.request.contextPath}/edit_user.hm?board_no=${queDetail.board_no}"  class="btn btn-danger" >수정</a> 
       <a href="${pageContext.request.contextPath}/delete_u.hm?board_no=${queDetail.board_no}"  class="btn btn-danger" >삭제</a>    
       <!-- <a href="javascript:window.history.back();"  class="btn btn-info" >목록보기</a>  -->
       <a href="${pageContext.request.contextPath}/home.hm"  class="btn btn-info" >목록보기</a> 
    </div>						 
  </div>	
<%@ include  file="../inc/footer.jsp" %>
