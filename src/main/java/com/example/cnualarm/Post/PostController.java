package com.example.cnualarm.Post;

import com.example.cnualarm.Dto.PostDto;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @Autowired
    PostService service;

    @GetMapping("posts")
    public JsonObject getPostList(@RequestHeader("Authorization") String token, @RequestParam("categoryNo") int categoryNum, @RequestParam("tag") String tag) throws Exception {
        return service.getPostList(token, categoryNum, tag);
    }

    @GetMapping("contents")
    public PostDto getPostContents(@RequestParam("articleNo") int articleNo){
        return service.getPostContents(articleNo);
    }
}
