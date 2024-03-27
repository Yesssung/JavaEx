package com.javaex.oop.tv;

public class TV {
		// 채널 & 볼륨 최소, 최대 범위
		private static final int MIN_CHANNEL = 1;
		private static final int MAX_CHANNEL = 255;
		private static final int MIN_VOLUME = 1;
		private static final int MAX_VOLUME = 100;
	
		private int channel;
		private int volume;
		private boolean power;
		
		public TV() {
			this.channel = 7;
			this.volume = 20;
			this.power = false;
		}
		
		public TV(int channel, int volume, boolean power) {
			this.channel = channel;
			this.volume = volume;
			this.power = power;
		}
////////////////////////////////////////////////////////////////////////////////////////////////		
		public int getChannel() {
			return channel;
		}
		public int getVolume() {
			return volume;
		}
		public boolean isPower() { // boolean은 get 안 쓰고 is 쓴다
			return power;
		}
///////////////////////////////////////////////////////////////////////////////////////////////
		
		// tv 켜기
		public void power(boolean on) {
			this.power = on;
		}
		// 채널 범위 체크 메서드
		public void channel(int channel) {
			if(channel >= MIN_CHANNEL && channel <= MAX_CHANNEL) {
				this.channel = channel;
			}
		}
		// 채널 범위 체크 메서드(오버로딩)
		public void channel(boolean up) {
			if(up) {
				if (this.channel < MAX_CHANNEL){
					this.channel ++;
				}
				else{
					if(this.channel > MIN_CHANNEL){
						this.channel --;
					}
				}
			}
		}
		// 볼륨 조절 메서드
		public void volume(int volume /*-> volume 같은건 일종의 이름표 저 안에 조건문을 방으로 보자면 volume이라는 이름표는 해당 방 내부에서만 작동 변경도 가능 그러나 알아보기 편해야 한다.*/) {
			if( volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
				this.volume = volume;
			}
		}
		// 볼륨 조절 메서드(오버로딩)
		public void volume(boolean up) {
			if(up) {
				if(this.volume < MAX_VOLUME) { // 최대 볼륨에 도달하지 않았기 때문에 볼륨을 더 높힐수 있다.
					this.channel ++;
				}
				else {
					if(this.volume > MIN_VOLUME) { // 최대 볼륨보다 높을 수 없기 때문에 무적권 낮출 수 밖에 없다.
						this.volume --;
					}
				}
			}
		}
		// 현재 상태
		public void status() {
			if(power) {
				System.out.println("전원: 켜짐");
				System.out.println("현재채널: " + channel);
				System.out.println("현재 음량: " + volume);
			} else {
				System.out.println("전원: 꺼짐");
			} System.out.println("------------------------");
			
		}
	
}
