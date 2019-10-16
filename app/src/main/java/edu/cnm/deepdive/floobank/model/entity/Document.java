package edu.cnm.deepdive.floobank.model.entity;

import androidx.room.ColumnInfo;
import androidx.room.PrimaryKey;

public class Document {
  @PrimaryKey(autoGenerate = true)
  @ColumnInfo(name="card_id")
  private long id;

  @NonNull
  @ColumnInfo(index = true)
  private Date created = new Date();

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
