package com.mrazi.hiddengem.mapper

import com.mrazi.hiddengem.dto.AchievementDto
import com.mrazi.hiddengem.model.Achievement
import org.mapstruct.InheritInverseConfiguration
import org.mapstruct.InjectionStrategy
import org.mapstruct.Mapper

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
interface AchievementMapper {

    fun toDto(achievement: Achievement): AchievementDto
    @InheritInverseConfiguration
    fun toModel(achievement: AchievementDto): Achievement

    fun toDtos(achievements: List<Achievement>): List<AchievementDto> {
        return achievements.map { t -> toDto(t) }
    }

}