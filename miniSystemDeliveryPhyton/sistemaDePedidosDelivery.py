def main():
    n = int(input("Insira a quantidade de pedidos: "))
 
    total = 0
 
    for i in range(1, n + 1):
        pedido = input("Insira o nome do pedido: ").split(" ")
        valor = float(input('Insira o valor do pedido: R$ '))
        total += valor

        valor_desconto = str(input("Insira o valor do desconto (10/20): "))
        get_desc = valor_desconto[0] + valor_desconto[1]
 
        while(get_desc != '10' and get_desc != '20'):
            print("Desculpe, mas esse valor de desconto não se encontra disponível! Tente novamente!")
            valor_desconto = (input("Insira o valor do desconto (10/20): "))
            get_desc = valor_desconto[0] + valor_desconto[1]
        else:
            if get_desc == '10':
                desconto = total - (total * 0.1)
                print('')
                print(f'Valor total com desconto de 10%: R$ {desconto:.2f}')
                total = 0
                print('')
            elif get_desc == '20':
                desconto = total - (total * 0.2)
                print('')
                print(f'Valor total com desconto de 20%: R$ {desconto:.2f}')
                total = 0
                print('')
            else:
                return
 
 
if __name__ == "__main__":
    main()