package com.jakewharton.sdksearch.api

import se.ansman.kotshi.JsonSerializable

@JsonSerializable
data class ApiItem(
  val id: Long,
  val label: String,
  val link: String,
  val type: String
)
