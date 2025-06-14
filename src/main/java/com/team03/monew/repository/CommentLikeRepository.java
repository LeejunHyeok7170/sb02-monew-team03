package com.team03.monew.repository;

import com.team03.monew.entity.Comment;
import com.team03.monew.entity.CommentLike;
import com.team03.monew.entity.User;
import com.team03.monew.repository.custom.CommentLikeRepositoryCustom;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentLikeRepository extends JpaRepository<CommentLike, UUID>,
    CommentLikeRepositoryCustom {
    boolean existsByCommentAndUser(Comment comment, User user);

    Optional<CommentLike> findByCommentAndUser(Comment comment, User user);

    List<CommentLike> findTop10ByUserOrderByCreatedAtDesc(User user);
}
