package com.walking.techie.csvtoxml.processor;

import com.walking.techie.csvtoxml.model.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemProcessor;

@Slf4j
public class StudentProcessor implements ItemProcessor<Student, Student> {

  @Override
  public Student process(Student item) throws Exception {
    log.info("Student processed : " + item);
    return item;
  }
}
