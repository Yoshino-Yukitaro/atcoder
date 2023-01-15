echo "ABCの数字を入力してください >>"
read num

mkdir ./abc/${num}

questions=("a" "b" "c" "d" "e" "f" "g" "ex")

for question in ${questions[@]}; do
    mkdir ./abc/${num}/${question}
    cp ./Main.java ./abc/${num}/${question}/Main.java
done

echo "作成が完了しました！"