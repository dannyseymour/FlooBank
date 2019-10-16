package edu.cnm.deepdive.floobank.model.entity;

import android.support.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity (
    foreignKeys = {
        @ForeignKey(
            entity = Provider.class,
            parentColumns = "provider_id",
            childColumns = "provider_id",
            onDelete = ForeignKey.CASCADE
        )
    }
)
public class ProviderAccount {
  @PrimaryKey(autoGenerate = true)
  @ColumnInfo(name="provideraccount_id")
  private long id;

  @NonNull
  @ColumnInfo(name= "request_id", index = true)
  private String RequestID;

  @NonNull
  @ColumnInfo(index = true)
  private Date updated = new Date();

  @ColumnInfo(name = "shoe_id",index=true)
  private Long shoeId;

  @ColumnInfo(name="hand_id",index=true)
  private Long handId;

  @NonNull
  private Rank rank;
  @NonNull
  private Suit suit;

}
