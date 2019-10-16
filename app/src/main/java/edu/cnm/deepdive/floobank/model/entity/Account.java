package edu.cnm.deepdive.floobank.model.entity;

import androidx.room.Entity;
import androidx.room.ForeignKey;

@Entity(
    foreignKeys = {
        @ForeignKey(
            entity = ProviderAccount.class,
            parentColumns = "provideraccount_id",
            childColumns = "provideraccount_id",
            onDelete = ForeignKey.CASCADE
        )
    }
)
public class Account {

}
