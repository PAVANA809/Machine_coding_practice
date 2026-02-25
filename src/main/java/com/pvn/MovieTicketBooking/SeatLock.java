package com.pvn.MovieTicketBooking;

import java.time.LocalDateTime;

class SeatLock {
   SeatStatus status;
   String lockedByUser;
   LocalDateTime lockExpiry;

   public SeatLock(SeatStatus status) {
      this.status = status;
   }

   public LocalDateTime getLockExpiry() {
      return lockExpiry;
   }

   public void setLockExpiry(LocalDateTime lockExpiry) {
      this.lockExpiry = lockExpiry;
   }

   public String getLockedByUser() {
      return lockedByUser;
   }

   public void setLockedByUser(String lockedByUser) {
      this.lockedByUser = lockedByUser;
   }

   public SeatStatus getStatus() {
      return status;
   }

   public void setStatus(SeatStatus status) {
      this.status = status;
   }
}