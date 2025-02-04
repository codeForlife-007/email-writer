package com.email_writer.controller;

import com.email_writer.dto.EmailRequest;
import com.email_writer.service.EmailGeneratorService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/email")
@AllArgsConstructor
@CrossOrigin("*")
public class EmailGenerateController {

  private final EmailGeneratorService emailGeneratorService;

  @PostMapping("/generate")
  public ResponseEntity<String> generateEmail(@RequestBody EmailRequest emailRequest) {
    return ResponseEntity.ok(emailGeneratorService.generateEmailReply(emailRequest));
  }
}
