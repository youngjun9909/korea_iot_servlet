package org.example.demo;

// 컨트롤러
// : Model의 데이터를 가져와 View에 전달하는 역할
// : 모델과 뷰를 중재하여 데이터 처리와 화면 출력을 분리하는 역할


public class HelloController {
    private HelloModel model;
    private HelloView view;

    public HelloController() {
        model = new HelloModel();
        view = new HelloView();
    }

    public void handleRequest() {
        String message = model.getMessage();
        view.displayMessage(message);
    }
}
