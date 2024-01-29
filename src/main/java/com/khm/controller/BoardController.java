package com.khm.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.lang.ProcessBuilder.Redirect;
import java.util.HashMap;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.khm.dto.BoardDto;
import com.khm.dto.BoardVoDto;
import com.khm.service.BoardService;


@Controller
public class BoardController {
	@Autowired BoardService service;
	
	
	@RequestMapping(value="/home.hm", method = RequestMethod.GET)
	public String board_home(@RequestParam(value="pstartno",defaultValue = "0") int pstartno,Model model,BoardDto bdto) {
		
		Map<String,Integer> para= new HashMap<>();
		para.put("pstartno", pstartno);
		para.put("onepagelimit", 10);
		
//		model.addAttribute("list",service_paging.listCnt(para));
//		model.addAttribute("paging",service.paging(pstartno));
		
		
		model.addAttribute("readNotice",service.readNotice());
		model.addAttribute("noticeList",service.noticeList());
		model.addAttribute("readQue",service.readQue(para));
		model.addAttribute("paging",service.paging(pstartno));
		model.addAttribute("myQueList",service.myQueList(bdto));
		return "home"; 
	}
	
	@RequestMapping(value="/detail_que.hm", method = RequestMethod.GET)
	public String detail_que(BoardVoDto dto,Model model) {
		model.addAttribute("queDetail",service.queDetail(dto));
		return "write_user_detail";
	}
	
	@RequestMapping(value="/write_user.hm", method = RequestMethod.GET)
	public String write_user() {
		return "write_user";
	}
	
	@RequestMapping(value="/write_user.hm", method = RequestMethod.POST)
	public void write_user(BoardDto dto,HttpServletRequest request,HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out=response.getWriter();
	
		
		if(service.queWrite(dto)>0) {
			out.print("<script>alert('글쓰기 성공'); location.href='home.hm';</script>");
		}
		else {
			out.print("<script>alert('글쓰기 실패');history.go(-1);</script>");
		}
		
	}
	
	@RequestMapping(value="/edit_user.hm", method = RequestMethod.GET)
	public String edit_user(BoardVoDto dto,Model model) {
		model.addAttribute("list",service.queDetail(dto));
		return "edit_user";
	}
	
	@RequestMapping(value="/edit_user.hm", method = RequestMethod.POST)
	public void edit_user(BoardVoDto dto,HttpServletRequest request,HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out=response.getWriter();
	
		if(service.queUpdate(dto)>0) {
			out.print("<script>alert('글 수정 성공'); location.href='home.hm';</script>"); // 추후 디테일 부분으로 바로 이동하게 설정
			
		}
		else {
			out.print("<script>alert('글 수정 실패');history.go(-1);</script>");
		}
		
	}
	
	@RequestMapping(value="/delete_u.hm", method = RequestMethod.GET)
	public void delete_u(BoardDto dto,HttpServletRequest request,HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out=response.getWriter();
	
		
		if(service.queDelete_u(dto)>0) {
			out.print("<script>alert('글 삭제 성공'); location.href='home.hm';</script>");
		}
		else {
			out.print("<script>alert('글 삭제 실패');history.go(-1);</script>");
		}
		
	}
	
	
	//공지사항
	@RequestMapping(value="/notice_detail.hm", method = RequestMethod.GET)
	public String notice_detail(BoardVoDto dto,Model model) {
		model.addAttribute("noticeDetail",service.noticeDetail(dto));
		return "notice_detail";
	}
	
	@RequestMapping(value="/edit_notice.hm", method = RequestMethod.GET)
	public String edit_notice(BoardVoDto dto,Model model) {
		model.addAttribute("list",service.noticeDetail(dto));
		return "edit_notice";
	}
	
	@RequestMapping(value="/edit_notice.hm", method = RequestMethod.POST)
	public void edit_notice(BoardVoDto dto,HttpServletRequest request,HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out=response.getWriter();
	
		if(service.noticeUpdate(dto)>0) {
			out.print("<script>alert('공지 수정 성공'); location.href='home.hm';</script>"); // 추후 디테일 부분으로 바로 이동하게 설정
			
		}
		else {
			out.print("<script>alert('공지 수정 실패');history.go(-1);</script>");
		}
		
	}
	
	@RequestMapping(value="/delete_notice.hm", method = RequestMethod.GET)
	public void delete_notice(BoardVoDto dto,HttpServletRequest request,HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out=response.getWriter();
	
		
		if(service.noticeDelete(dto)>0) {
			out.print("<script>alert('공지 삭제 성공'); location.href='home.hm';</script>");
		}
		else {
			out.print("<script>alert('공지 삭제 실패');history.go(-1);</script>");
		}
		
	}
	
	@RequestMapping(value="/write_notice.hm", method = RequestMethod.GET)
	public String write_notice() {
		return "write_notice";
	}
	
	@RequestMapping(value="/write_notice.hm", method = RequestMethod.POST)
	public String write_notice(BoardVoDto dto,HttpServletRequest request,HttpServletResponse response,Model model) throws IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out=response.getWriter();
		service.noticeWrite_1(dto);
		model.addAttribute("notice_write",service.noticeWrite_1_select(dto));
		return "write_day";
		
		
		
	}
	
	@RequestMapping(value="/write_notice_end.hm", method = RequestMethod.POST)
	public void write_notice_end(BoardVoDto dto,HttpServletRequest request,HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out=response.getWriter();
	
		
		if(service.noticeWrite_2(dto)>0) {
			out.print("<script>alert('글쓰기 성공'); location.href='home.hm';</script>");
		}
		else {
			out.print("<script>alert('글쓰기 실패');history.go(-1);</script>");
		}
		
	}
	
	
	
}
