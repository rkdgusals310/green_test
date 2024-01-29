package com.khm.dto;

import lombok.Data;

@Data
public class BoardVoDto {
	private int board_no;
	private String board_title;
	private String board_content;
	private String board_date;
	private int board_hit;
	private Boolean board_open;	
	private int status_no;
    private String user_name;
    private String macro_content;
    
    private int user_no;
    private String board_start;
    private String board_end;
}
/*
	#{board_title} ,#{board_content} ,#{board_open} ,#{board_start},#{board_end} ,#{user_no} 
*/