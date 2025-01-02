package actions.service;

import actions.entity.Student;
import actions.repository.ActionsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ActionsService {

    private final ActionsRepository actionsRepository;

    public Student addStudent(Student student) {
        actionsRepository.save(student);
        return student;
    }
}
