<<<<<<< HEAD
//package com.example.teamproject.domain.dao.board;
//
//import com.example.teamproject.domain.vo.BoardReplyVO;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//@RequiredArgsConstructor
//public class BoardReplyDAO {
//    private final ReplyMapper boardReplyMapper;
//
//    // 다이어리 댓글 작성
//    public void register(BoardReplyVO boardReplyVO){
//
//    };
//
//    // 다이어리 댓글 1개 조회
//    public BoardReplyVO read(Long rno){
//
//    };
//
//    // 다이어리 댓글 전체 목록 조회
//    public List<BoardReplyVO> getList(Long bno, Criteria criteria){
//
//    }
//
//    // 다이어리 댓글 삭제
//    public boolean remove(Long rno){
//
//    };
//
//    // 다이어리 댓글 수정
//    public boolean modify(BoardReplyVO boardReplyVO){
//
//    };
//
//    // 다이어리 댓글 개수
//    public int getTotal(Long bno){
//
//    };
//
//}
=======
package com.example.teamproject.domain.dao.board;

import com.example.teamproject.domain.vo.BoardReplyVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BoardReplyDAO {
    private final ReplyMapper boardReplyMapper;

    // 다이어리 댓글 작성
    public void register(BoardReplyVO boardReplyVO){
        boardReplyMapper.insert(boardReplyVO);
    };

    // 다이어리 댓글 1개 조회
    public BoardReplyVO read(Long rno){
        return boardReplyMapper.getReply(rno);
    };

    // 다이어리 댓글 전체 목록 조회
    public List<BoardReplyVO> getList(Long bno, Criteria criteria){
        return boardReplyMapper.getList(criteria, bno);
    }

    // 다이어리 댓글 삭제
    public int remove(Long rno){
        return  boardReplyMapper.delete(rno);
    };

    // 다이어리 댓글 수정
    public int modify(BoardReplyVO boardReplyVO){
        return  boardReplyMapper.update(boardReplyVO);
    };

    // 다이어리 댓글 개수
    public int getTotal(Long bno){
        return  boardReplyMapper.getTotal(bno);
    };

}
>>>>>>> d8861bedc3b6c0c410020b48a8b1c936d06867d5
