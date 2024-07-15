package org.zerock.b02.repository;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.zerock.b02.domain.Board;
import org.zerock.b02.domain.Reply;
import org.zerock.b02.repository.search.ReplyRepository;

@SpringBootTest
@Log4j2
public class ReplyRepositoryTests {

    @Autowired
    private ReplyRepository replyRepository;

    @Test
    public void testSave() {

        //DB에 있는 게시글
        Long bno = 100L;

        Board board = Board.builder().bno(bno).build();

        Reply reply = Reply.builder()
                .board(board)
                .replyText("댓글2....")
                .replyer("replyer1")
                .build();

        Reply result = replyRepository.save(reply);
        log.info(result);
    }

    @Test
    public void testBaordReplies() {
        Long bno = 100L;
        Pageable pageable = PageRequest.of(0, 10, Sort.by("rno").descending());
        Page<Reply> result = replyRepository.listOfBoard(bno, pageable);
        //결과에 Page 객체에 댓글 리스트가 포함되어 있으므로 getContent 로 리스트를 꺼내서 출력
        result.getContent().forEach(reply -> {
            log.info(reply);
        });
    }
}
