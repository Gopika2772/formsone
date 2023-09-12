package com.worldline.forms.aws.forms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.worldline.forms.aws.forms.entity.Forms;
import com.worldline.forms.aws.forms.repository.FormsRepository;

@RestController
public class FormsController {
    @Autowired
    private FormsRepository formsRepository;

    @GetMapping("/get-forms")
    public List<Forms> getForms() {
        return formsRepository.findAll();

    }

    @PostMapping("/post-forms")
    public Forms postForm(@RequestBody Forms forms) {
        return formsRepository.save(forms);
    }
}
