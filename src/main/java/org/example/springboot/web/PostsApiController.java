package org.example.springboot.web;

import lombok.RequiredArgsConstructor;
import org.example.springboot.web.dto.PostsResponseDto;
import org.example.springboot.web.dto.PostsSaveRequestDto;
import org.example.springboot.web.dto.PostsUpdateRequestDto;
import org.springframework.web.bind.annotation.*;
import org.example.springboot.service.posts.PostsService;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts") //그니까 찬결아 어떤 단계가 끝나면 항상 커밋을 해야함 ㅋㅋㅋ ㅋㅋㅋㅋㅋ 그래야 이력 추적을 할 수가 있음 음 중요한 메시지군 일단 적어보자 그럼ㅇㅋ ㄱㄱ
    public Long save(@RequestBody PostsSaveRequestDto requestDto){
        System.out.println("2번 실제로 여기서 반응한다면 뜨겠지.");
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}") // 이게 없어서 그랬던거임. 테스트에서 PUT 요청으로 해당 URL 찾아서 보내는데, 이게 없던거. ㅇ앜?아.. 이게 왜 안적었지 몇번 확인 햇는데
    //이게 111페이지에 있었어.방금 확인함 ㅇㅋ . 일단
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) { return postsService.update(id, requestDto);}

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById (@PathVariable Long id){
        return postsService.findById(id);
    }

    //임시 테스트용 주석(지우기) -- 다시 테스트 --english
    @DeleteMapping("/api/v1/posts/{id}")
    public Long delete(@PathVariable Long id) {
        postsService.delete(id);
        return id;
    }
}
// ㅋㅋ 진정해 찬결 원래 마우스로 분을 푸는 스타일임? ㄴㄴ 형이 이거 하면서 지운거 아님?? 그런가? ㅋㅋㅋㅋㅋㅋㅋ 아닐걸 ㅋㅋㅇㅋ
//다시 터미널 띄워줘