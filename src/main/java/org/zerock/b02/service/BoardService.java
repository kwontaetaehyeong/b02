package org.zerock.b02.service;

import org.zerock.b02.dto.BoardDTO;
import org.zerock.b02.dto.BoardListReplyCountDTO;
import org.zerock.b02.dto.PageRequestDTO;
import org.zerock.b02.dto.PageResponseDTO;

public interface BoardService {
    //새 글을 등록
    Long register(BoardDTO boardDTO);
    //글 조회 (글번호)
    BoardDTO readOne(Long bno);
    //글 수정
    void modify(BoardDTO boardDTO);
    //삭제
    void remove(Long bno);

    PageResponseDTO<BoardDTO> list(PageRequestDTO request);

    //댓글갯수 포함
    PageResponseDTO<BoardListReplyCountDTO> listWithReplyCount(PageRequestDTO pageRequestDTO);
}

