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
 * @param id Unique identifier for the quest
 * @param name Name of the quest
 * @param duration Duration of the quest in days
 * @param createdBy ID of the admin who created the quest
 * @param createdAt Timestamp indicating when the quest was created
 */
data class Quest(

    @Schema(example = "null", description = "Unique identifier for the quest")
    @get:JsonProperty("id") val id: kotlin.Int? = null,

    @Schema(example = "null", description = "Name of the quest")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "Duration of the quest in days")
    @get:JsonProperty("duration") val duration: kotlin.Int? = null,

    @Schema(example = "null", description = "ID of the admin who created the quest")
    @get:JsonProperty("created_by") val createdBy: kotlin.Int? = null,

    @Schema(example = "null", description = "Timestamp indicating when the quest was created")
    @get:JsonProperty("created_at") val createdAt: java.time.OffsetDateTime? = null
) {

}

