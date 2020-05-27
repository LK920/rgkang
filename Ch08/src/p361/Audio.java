package p361;

import p349.RemoteControl;

public class Audio implements RemoteControl {
		//�ʵ�
		private int volume;
		private boolean mute;

		//turnOn() �߻� �޼ҵ��� ��ü �޼ҵ�
		@Override
		public void turnOn() {
			System.out.println("������� �մϴ�.");
		}
		//turnOff() �߻� �޼ҵ��� ��ü �޼ҵ�
		@Override
		public void turnOff() {
			System.out.println("������� ���ϴ�.");
		}
		//setVolume �߻� �޼ҵ��� ��ü �޼ҵ�
		@Override
		public void setVolume(int volume) {
			if(volume>RemoteControl.MAX_VOLUME) {
				this.volume = RemoteControl.MAX_VOLUME;
			}else if(volume<RemoteControl.MIN_VOLUME){
				this.volume = RemoteControl.MIN_VOLUME;
			}else {
				this.volume= volume;
			}
			System.out.println("���� ����� ���� : "+this.volume);
		}
		
		@Override
		public void setMute(boolean mute) {
			this.mute = mute;
			if(mute) {
				System.out.println("����� ���� ó���մϴ�.");
			}else {
				System.out.println("����� ���� �����մϴ�.");
			}
		}
}