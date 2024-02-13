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
 * @param id Unique identifier for the quest tier
 * @param questId ID of the quest to which this tier belongs
 * @param tierNumber Number representing the tier level
 * @param orderGoal Number of orders required to achieve this tier
 * @param reward Reward associated with achieving this tier
 */
data class QuestTier(

    @Schema(example = "null", description = "Unique identifier for the quest tier")
    @get:JsonProperty("id") val id: kotlin.Int? = null,

    @Schema(example = "null", description = "ID of the quest to which this tier belongs")
    @get:JsonProperty("quest_id") val questId: kotlin.Int? = null,

    @Schema(example = "null", description = "Number representing the tier level")
    @get:JsonProperty("tier_number") val tierNumber: kotlin.Int? = null,

    @Schema(example = "null", description = "Number of orders required to achieve this tier")
    @get:JsonProperty("order_goal") val orderGoal: kotlin.Int? = null,

    @Schema(example = "null", description = "Reward associated with achieving this tier")
    @get:JsonProperty("reward") val reward: kotlin.Int? = null
) {

}

