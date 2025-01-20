package com.waseefakhtar.doseapp.data.mapper

import com.waseefakhtar.doseapp.data.entity.MedicationEntity
import com.waseefakhtar.doseapp.domain.model.Medication
import java.util.Date

fun MedicationEntity.toMedication(): Medication {
    return Medication(
        id = id,
        name = name,
        dosage = dosage,
        recurrence = recurrence,
        startDate = startDate ?: Date(),
        endDate = endDate,
        medicationTime = medicationTime,
        medicationTaken = medicationTaken
    )
}

fun Medication.toMedicationEntity(): MedicationEntity {
    return MedicationEntity(
        id = id,
        name = name,
        dosage = dosage,
        recurrence = recurrence,
        startDate = startDate,
        endDate = endDate,
        medicationTime = medicationTime,
        medicationTaken = medicationTaken
    )
}
