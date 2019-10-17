package edu.cnm.deepdive.floobank.model.entity;

import android.support.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(
    foreignKeys = {
        @ForeignKey(
            entity = ProviderAccount.class,
            parentColumns = "provideraccount_id",
            childColumns = "provideraccount_id",
            onDelete = ForeignKey.CASCADE
        ),
        @ForeignKey(
            entity =Provider.class,
            parentColumns =  = "provider_id",
            childColumns = "provider_id",
            onDelete = ForeignKey.CASCADE
        )
    }
)
public class Account {
  @PrimaryKey(autoGenerate = true)
  @ColumnInfo(name="account_id")
  private long id;

  @NonNull
  @ColumnInfo(name = "account_name", index = true)
  private String name;

  @NonNull
  @ColumnInfo(name = "account_number", index = true)
  private int accountNumber = 0;

  @ColumnInfo(name = "account_type",index=true)
  private String accountType;

  @ColumnInfo(name="hand_id",index=true)
  private Long handId;

  @NonNull
  private Rank rank;
  @NonNull
  private Suit suit;

}
