package de.hennroja.example.springkafka.model

data class LeasingOffer(val make: String,
        val model: String,
        val variant: String,
        val totalPrice: Double,
        val leasingRate: Double
)