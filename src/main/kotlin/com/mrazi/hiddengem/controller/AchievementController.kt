package com.mrazi.hiddengem.controller

import com.mrazi.hiddengem.dto.AchievementDto
import com.mrazi.hiddengem.service.AchievementService
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin
@RequestMapping("/gem")
class AchievementController(val achievementService: AchievementService) {

    @PostMapping
    fun save(@RequestBody dto: AchievementDto): AchievementDto {
        return achievementService.save(dto);
    }

}