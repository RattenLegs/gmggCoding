package org.zerock.mapper;

import java.util.List;

// import org.apache.ibatis.annotations.Select; xml에 매퍼를 기록하게 되서 사라짐

import orc.zerock.domain.BoardVO;

public interface BoardMapper {

	//@Select("select * from tbl_board where bno > 0"): xml에 매퍼를 기록하게 되서 사라짐
	public List<BoardVO> getList();
}
