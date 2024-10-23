package com.tenco.blog_v3.user;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RequiredArgsConstructor
@Slf4j
@Controller
public class UserController {

    // DI 처리
    private final UserService userService;
    private final HttpSession session;

    /**
     * 회원 정보 수정
     * @return 메인 페이지
     */
    @PutMapping("/api/user/{id}")
    public String update(@RequestBody UserDTO.UpdateDTO updateDTO) {
//        User sessionUser = (User) session.getAttribute("sessionUser");
//        if (sessionUser == null) {
//            return "redirect:/login-form";
//        }
//        User updatedUser = userService.updateUser(sessionUser.getId(), reqDTO);
//        // 세션 정보 동기화 처리
//        session.setAttribute("sessionUser", updatedUser);
        return "redirect:/";
    }

    /**
     * 회원 가입 기능 요청
     * @return
     */
    @PostMapping("/join")
    public String join()  {
//        // 유효성 검사 생략 ...
//        try {
//            userService.signUp(reqDto);
//        } catch (DataIntegrityViolationException e) {
//            throw new Exception500("동일한 유저네임이 존재 합니다.");
//        }
        return "redirect:/login-form";
    }

    /**
     * 자원에 요청은 GET 방식이지만 보안에 이유로 예외 !
     * 로그인 처리 메서드
     * 요청 주소 POST : http://localhost:8080/login
     * @return
     */
    @PostMapping("/login")
    public String login() {
//        try {
//            User sessionUser = userService.signIn(reqDto);
//            session.setAttribute("sessionUser", sessionUser);
            return  "redirect:/";
//        } catch (Exception e) {
//            throw new Exception401("유저이름 또는 비밀번호가 틀렸습니다.");
//        }
    }

    @GetMapping("/logout")
    public String logout() {
        session.invalidate(); // 세션을 무효화 (로그아웃)
        return "redirect:/";
    }

}