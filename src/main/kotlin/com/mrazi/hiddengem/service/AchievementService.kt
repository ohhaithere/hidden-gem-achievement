package com.mrazi.hiddengem.service

import com.mrazi.hiddengem.dto.AchievementDto
import com.mrazi.hiddengem.mapper.AchievementMapper
import com.mrazi.hiddengem.repository.AchievementRepository
import org.springframework.stereotype.Component
import java.time.LocalDateTime
import java.util.*

@Component
class AchievementService(private var achievementRepository: AchievementRepository,
                         private var mapper: AchievementMapper) {

    fun save (dto: AchievementDto): AchievementDto {
        val gem = mapper.toModel(dto)
        gem.id = UUID.randomUUID()
        gem.created = LocalDateTime.now()
        achievementRepository.save(gem)
        return mapper.toDto(gem)
    }

    fun update (dto: AchievementDto): AchievementDto {
        val gem = mapper.toModel(dto)
        achievementRepository.save(gem)
        return mapper.toDto(gem)
    }

    fun get(id: UUID): AchievementDto {
        return mapper.toDto(achievementRepository.getById(id));
    }

    fun get(): List<AchievementDto> {
        return mapper.toDtos(achievementRepository.findAll());
    }

}