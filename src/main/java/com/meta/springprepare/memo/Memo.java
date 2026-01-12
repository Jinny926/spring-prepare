package com.meta.springprepare.memo;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class Memo {
    private final String username;
    private final String contents;
    private String title;
    private Date createAt;
    private Date updateAt;
}

