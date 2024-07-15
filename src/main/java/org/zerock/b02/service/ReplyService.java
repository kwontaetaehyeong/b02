package org.zerock.b02.service;

import org.zerock.b02.dto.PageRequestDTO;
import org.zerock.b02.dto.PageResponseDTO;
import org.zerock.b02.dto.ReplyDTO;

public interface ReplyService {
    //댓글 등록
    Long register(ReplyDTO replyDTO);
    //조회
    ReplyDTO read(Long rno);
    //수정
    void modify(ReplyDTO replyDTO);
    //삭제
    void remove(Long rno);
    //게시글의 모든 댓글 검색
    PageResponseDTO<ReplyDTO> getListOfBoard(Long bno, PageRequestDTO pageRequestDTO);
}
