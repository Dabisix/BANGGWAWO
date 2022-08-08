package com.ssafy.banggawawo.controller;

import com.ssafy.banggawawo.domain.dto.EnrolDto;
import com.ssafy.banggawawo.domain.entity.ClassRoom;
import com.ssafy.banggawawo.domain.entity.Enrol;
import com.ssafy.banggawawo.domain.entity.Student;
import com.ssafy.banggawawo.service.EnrolService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enrol")
public class EnrolController {
    private final EnrolService enrolService;

    @Autowired
    public EnrolController(EnrolService enrolService) {
        this.enrolService = enrolService;
    }

    @ApiOperation("수강신청 등록하기")
    @PostMapping()
    public ResponseEntity<EnrolDto> save(@RequestBody EnrolDto enrolDto){
        return new ResponseEntity<>(enrolService.save(enrolDto), HttpStatus.OK);
    }
    @ApiOperation("수업에 수강신청한 학생 받아오기")
    @GetMapping("/class/{id}")
    public ResponseEntity<List<Enrol>> findByClassRoom(@PathVariable("id") Long cId){
        return new ResponseEntity<>(enrolService.findByClassRoom(cId) ,HttpStatus.OK);
    }
    @ApiOperation("학생이 수강신청한 수업 받아오기")
    @GetMapping("/student/{id}")
    public ResponseEntity<List<Enrol>> findByStudent(@PathVariable("id") Long sId){
        return new ResponseEntity<>(enrolService.findByStudent(sId), HttpStatus.OK);
    }


    @ApiOperation("피드백 작성")
    @PutMapping("/feedback")
    public ResponseEntity<?> update(@RequestBody EnrolDto enrolDto){
        return new ResponseEntity<>(enrolService.update(enrolDto),HttpStatus.OK);
    }
    @ApiOperation("한 학생의 한 수업에 대한 피드백 가져오기")
    @GetMapping("/{cid}/{sid}")
    public ResponseEntity<?> saveFeedback(@PathVariable("cid") Long cid, @PathVariable("sid") Long sid){
        return new ResponseEntity<>(enrolService.findByClassAndStudent(cid, sid), HttpStatus.OK);
    }
}