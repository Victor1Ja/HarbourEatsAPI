package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param id Unique identifier for the quest participation history
 * @param courierId ID of the courier
 * @param questId ID of the quest
 * @param participationDate Date when the courier participated in the quest
 * @param outcome Outcome of the quest participation (e.g., completed, not completed)
 * @param tierReached Number representing the tier reached by the courier. If not completed, this field will be null. If completed, this field will be the tier number.
 */
data class QuestParticipationHistory(

    @Schema(example = "null", description = "Unique identifier for the quest participation history")
    @get:JsonProperty("id") val id: kotlin.Int? = null,

    @Schema(example = "null", description = "ID of the courier")
    @get:JsonProperty("courier_id") val courierId: kotlin.Int? = null,

    @Schema(example = "null", description = "ID of the quest")
    @get:JsonProperty("quest_id") val questId: kotlin.Int? = null,

    @Schema(example = "null", description = "Date when the courier participated in the quest")
    @get:JsonProperty("participation_date") val participationDate: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "Outcome of the quest participation (e.g., completed, not completed)")
    @get:JsonProperty("outcome") val outcome: kotlin.String? = null,

    @Schema(example = "null", description = "Number representing the tier reached by the courier. If not completed, this field will be null. If completed, this field will be the tier number.")
    @get:JsonProperty("tier_reached") val tierReached: kotlin.Int? = null
) {

}

