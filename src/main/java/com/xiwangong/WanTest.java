package com.xiwangong;

public class WanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntoDeliver intoDeliver = new IntoDeliver();
		XiWanGong jiarui1 = new XiWanGong();
		XiWanGong jiarui2 = new XiWanGong();
		WanDeliver wanDeliver = new WanDeliver();
		WanGui wanGui = new WanGui();
		for (int j = 0; j < 10; j++) {
			intoDeliver.intoDeliver(intoDeliver.createWan(), wanDeliver);
			jiarui1.getWan(wanDeliver.removeWan(), wanGui, wanDeliver);
			jiarui2.getWan(wanDeliver.removeWan(), wanGui, wanDeliver);
		}
		System.out.println("�ܹ�����" + IntoDeliver.IntoWanCount + "����");
		System.out
				.println("ϴ�빤jiarui1ϴ��" + jiarui1.getCount() + "����" + " " + "ϴ�빤jiarui2ϴ��" + jiarui2.getCount() + "����");
		System.out.println("����̨��ʣ��" + WanDeliver.deliverWanCount + "����");
		System.out.println("�������" + WanGui.wanGuiAcount + "����");
		if (IntoDeliver.IntoWanCount == WanDeliver.deliverWanCount + WanGui.wanGuiAcount) {
			System.out.println("jiarui1��jiarui2��������û�ж�һ����");
		} else {
			System.out.println(
					"����" + (IntoDeliver.IntoWanCount - WanDeliver.deliverWanCount - WanGui.wanGuiAcount) + "���룬�۹��ʣ�����");
		}

	}

}
