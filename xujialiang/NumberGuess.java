package com.zizai.main;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {

	public static void main(String[] args) {
		
			//�������һ��0~9����  random.nextInt(9)  ��9�����������ֵķ�Χ
			Random random = new Random();
			int number = random.nextInt(9);
						
			//�ڿ���̨���һ�仰�������������������
			System.out.println("������һ��0~9�����֣�");
			
			//��������̨����
			Scanner reader = new Scanner(System.in);
			//�ѿ���̨���뱣���һ������
			int userInputNum = reader.nextInt();
			
			//�ж����if������������жϵ������������������ľͻ���if����������������
			//����жϵ����ǼٵĻ����ͻ���else�����ŵ�����
			if(number == userInputNum){
				System.out.println("��ϲ������");
			}else{
				System.out.println("��Ǹ����ˣ�\n��ȷ���ǣ�"+number);
			}
	}

}
