package com.oofgz.fight.dto.redis;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@RequiredArgsConstructor
@Data
public class RedisUser implements Serializable {

    private static final long serialVersionUID = -1L;

    @NonNull
    private String username;

    @NonNull
    private Integer age;

}
