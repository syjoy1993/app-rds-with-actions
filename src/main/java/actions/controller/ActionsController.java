package actions.controller;

import actions.entity.Student;
import actions.service.ActionsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ActionsController {

	private final ActionsService actionsService;

	@GetMapping(value = "/api/actions")
	public String actionsTest() {
		return "app-Docker-Compose-with-actions version:0.0.1 왜그래";
	}

	@PostMapping("/api/save1")
	public String save1(@RequestBody Student student) {
		actionsService.addStudent(student);
		return "save " + student.getName() + "good";
	}

}
