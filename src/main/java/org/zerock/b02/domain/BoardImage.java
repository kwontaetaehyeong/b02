package org.zerock.b02.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "board")
public class BoardImage implements Comparable<BoardImage> {
    @Id
    private String uuid;
    private String fileName;
    private int ord;

    @ManyToOne
    private Board board; //여러개의 이미지  == 한개 게시글

    @Override
    public int compareTo(BoardImage other) {
        return this.ord =other.ord; //이미지객체의 순서를 순번으로 정함
    }
    public void changeBoard(Board board) {
        this.board = board;
    }

}
