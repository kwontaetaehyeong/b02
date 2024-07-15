package org.zerock.b02.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReplyDTO {
    private Long rno;               //댓글번호
    @NotNull
    private Long bno;               //게시글번호
    @NotEmpty
    private String replyText;       //댓글내용
    @NotEmpty
    private String replyer;         //게시자
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime regDate; //등록일자
    @JsonIgnore
    private LocalDateTime modDate; //수정일자
}
