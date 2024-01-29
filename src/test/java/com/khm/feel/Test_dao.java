package com.khm.feel;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.khm.dao.BoardDao;
import com.khm.dto.BoardDto;
import com.khm.dto.BoardRootDto;
import com.khm.dto.BoardVoDto;
import com.khm.dto.MacroDto;
import com.khm.service.BoardService;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class Test_dao {
	@Autowired ApplicationContext context;
	@Autowired BoardDao dao;
	@Autowired BoardService service;
	
	@Test @Ignore
	public void test0() {
		log.info(context);
	}
	
	
	@Test //@Ignore
	public void test1() {
		BoardDto dto= new BoardDto();
		BoardRootDto brdto= new BoardRootDto();
		BoardVoDto vodto= new BoardVoDto();
		MacroDto mdto = new MacroDto();
		
//		System.out.println(dao.readNotice());
//		System.out.println(service.readNotice());
		
//		System.out.println(dao.readQue());
//		System.out.println(service.readQue());
		
//		dto.setBoard_no(1);
//		System.out.println(dao.queDetail(dto));
		
//		dto.setBoard_no(1);
//		System.out.println(service.queDetail(dto));
		
		
		
		
		
		
//		dto.setBoard_title("test01/25");
//		dto.setBoard_content("2024/01/25");
//		dto.setBoard_open(true);
//		dto.setUser_no(1001);
//		System.out.println(dao.queWrite(dto));
		
//		dto.setBoard_title("test01/25");
//		dto.setBoard_content("2024/01/25");
//		dto.setBoard_open(true);
//		dto.setUser_no(1001);
//		System.out.println(service.queWrite(dto));
		
		
		/*
		dto.setBoard_title("test01/25_update");
		dto.setBoard_content("2024/01/25_new");
		dto.setBoard_open(true);
		dto.setUser_no(1001);
		dto.setBoard_no(6);
		System.out.println(dao.queUpdate(dto));*/
		
//		dto.setBoard_title("test01/25_update");
//		dto.setBoard_content("2024/01/25_new");
//		dto.setBoard_open(true);
//		dto.setUser_no(1001);
//		dto.setBoard_no(263);
//		System.out.println(service.queUpdate(dto));
		
		
		
		
//		dto.setBoard_no(6);
//		System.out.println(dao.queDelete_u(dto));
		
//		dto.setBoard_no(262);
//		System.out.println(service.queDelete_u(dto));
		
		
		
//		dto.setUser_no(1001);		
//		System.out.println(dao.myQueList(dto));
	
		
		
//		dto.setUser_no(1001);		
//		System.out.println(service.myQueList(dto));
		
		
//		System.out.println(dao.noticeList());
//		System.out.println(service.noticeList());		
		
		
		/*
		dto.setBoard_no(1);
		System.out.println(dao.noticeDetail(dto));
		*/
		
//		dto.setBoard_no(1);
//		System.out.println(service.noticeDetail(dto));
		
		
		
		/*
		dto.setBoard_title("tt");
		dto.setBoard_content("tt");
		dto.setBoard_open(true);
		dto.setUser_no(1003);
		brdto.setBoard_start("2024-11-11");
		brdto.setBoard_end("2025-11-11");
		brdto.setBoard_no(29);
		
		System.out.println(dao.noticeWrite_1(dto));
		System.out.println(dao.noticeWrite_2(brdto));*/
		
//		vodto.setBoard_title("tt");
//		vodto.setBoard_content("tt");
//		vodto.setBoard_open(true);
//		vodto.setUser_no(1003);
//		vodto.setBoard_start("2024-11-11");
//		vodto.setBoard_end("2025-11-11");
//		vodto.setBoard_no(266);
//		
//		System.out.println(service.noticeWrite(vodto));
		/*이부분 생각해봐야함 board추가와 동시에 board의 board_no를 받아와서 board_root에 추가해줘야함*/
		
		
		
		/*
		  update board set board_title=#{board_title},board_content=#{board_content},board_open=#{board_open}
		  where board_no=#{board_no} 
		  
		 */
		
		/*
		dto.setBoard_title("trrrt");
		dto.setBoard_content("trrrt");
		dto.setBoard_open(true);
		dto.setUser_no(1003);
		dto.setBoard_no(29);
		brdto.setBoard_start("2022-11-11");
		brdto.setBoard_end("2025-11-11");
		brdto.setBoard_no(29);
		
		System.out.println(dao.noticeUpdate_1(dto));
		System.out.println(dao.noticeUpdate_2(brdto));*/
		
//		vodto.setBoard_title("trrrt");
//		vodto.setBoard_content("trrrt");
//		vodto.setBoard_open(true);
//		vodto.setUser_no(1003);
//		vodto.setBoard_no(266);
//		vodto.setBoard_start("2022-11-11");
//		vodto.setBoard_end("2025-11-11");
//		
//		
//		System.out.println(service.noticeUpdate(vodto));
		
		
		
		
//		System.out.println(dao.rootQueList());
//		System.out.println(service.rootQueList());
		
//		dto.setMacro_no(1);
//		dto.setBoard_no(21);
//		System.out.println(dao.reply(dto));
		
//		dto.setMacro_no(1);
//		dto.setBoard_no(265);
//		System.out.println(service.reply(dto));
		
		/*dto.setBoard_no(21);
		System.out.println(dao.queDelete_r(dto));*/
		
//		dto.setBoard_no(188);
//		System.out.println(service.queDelete_r(dto));
		
//		System.out.println(dao.macroList());
//		mdto.setMacro_no(1);
//		System.out.println(dao.macroDetail(mdto));
		
//		System.out.println(dao.macroList());
//		mdto.setMacro_no(1);
//		System.out.println(service.macroDetail(mdto));
		
//		mdto.setMacro_content("test");
//		System.out.println(dao.macroWrite(mdto));
		
//		mdto.setMacro_content("test01/25");
//		System.out.println(service.macroWrite(mdto));
		
		
		
//		mdto.setMacro_content("rkrkrkrkr");
//		mdto.setMacro_no(3);
//		System.out.println(dao.macroUpdate(mdto));
		
//		mdto.setMacro_content("rkrkrkrkr");
//		mdto.setMacro_no(4);
//		System.out.println(service.macroUpdate(mdto));
		
//		mdto.setMacro_no(3);
//		System.out.println(dao.macroDelete(mdto));
		
//		mdto.setMacro_no(4);
//		System.out.println(service.macroDelete(mdto));
	
	}
}
