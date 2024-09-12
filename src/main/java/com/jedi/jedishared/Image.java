package com.jedi.jedishared;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Image {
    @Id
    private UUID id;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] image;

    public Image(){}

    public void setId(UUID id){this.id = id;}
    public UUID getId(){return this.id;}

    public void setImage(byte[] image) {this.image=image;}
    public byte[] getImage(){return this.image;}
}
