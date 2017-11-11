package com.github.harmonie.mylittletwitter.db.impl;

import com.github.harmonie.mylittletwitter.db.TweetRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;

@Repository
public class TweetRepositoryImpl implements TweetRepository{

    private JdbcTemplate db;

    @Inject
    public TweetRepositoryImpl(JdbcTemplate db) {
        this.db = db;
    }
}
