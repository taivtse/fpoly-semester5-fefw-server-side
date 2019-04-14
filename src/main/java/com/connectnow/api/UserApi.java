package com.connectnow.api;

import com.connectnow.constant.ApiConstant;
import com.connectnow.dto.SearchUserDto;
import com.connectnow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(ApiConstant.API_USER_URL)
public class UserApi {
    private final UserService userService;

    @Autowired
    public UserApi(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("search")
    @ResponseBody
    public List<SearchUserDto> searchUser(@RequestParam(name = "name") String name) {
        return this.userService.findSearchUserByName(name);
    }
}
