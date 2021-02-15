package com.aveine.aveine2021.model

data class IncludedItem(val relationships: Relationships,
                        val meta: Meta,
                        val attributes: Attributes,
                        val links: Links,
                        val type: String = "")