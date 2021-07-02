package com.taiwarm.cloud.search.config;

import com.alibaba.fastjson.JSON;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class ElasticsearchConfigTest {

    @Qualifier("restHighLevelClient")
    @Autowired
    private RestHighLevelClient client;

    @Test
    public void test1(){
        System.out.println("client===="+client);
    }

    /**
     * 测试存储数据到 ES。
     * */
    @Test
    public void testIndexData() throws IOException {
        IndexRequest request = new IndexRequest("users");
        request.id("1"); // 文档的 id

        //构造 User 对象
        User user = new User();
        user.setUsername("PassJava");
        user.setAge(18);
        user.setGender("Man");

        //User 对象转为 JSON 数据
        String jsonString = JSON.toJSONString(user);

        // JSON 数据放入 request 中
        request.source(jsonString, XContentType.JSON);

        // 执行插入操作
        IndexResponse response = client.index(request, RequestOptions.DEFAULT);

        System.out.println(response);
    }



}
