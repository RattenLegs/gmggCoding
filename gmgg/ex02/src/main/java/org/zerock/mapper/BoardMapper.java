package org.zerock.mapper;

import java.util.List;

// import org.apache.ibatis.annotations.Select; xml�� ���۸� ����ϰ� �Ǽ� �����

import orc.zerock.domain.BoardVO;

public interface BoardMapper {

	//@Select("select * from tbl_board where bno > 0"): xml�� ���۸� ����ϰ� �Ǽ� �����
	public List<BoardVO> getList();
}
