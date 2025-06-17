<?xml version="1.0" encoding="UTF-8"?>
<sql:Host xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:sql="http://www.example.org/sql">
  <banco nome="topicos">
    <tabela nome="tb1">
      <coluna nome="id_tb1" tipo_dado="int"/>
    </tabela>
    <tabela nome="tb2">
      <coluna nome="id_tb2"/>
    </tabela>
    <tabela nome="tb3">
      <coluna nome="id_tb3" tipo_dado="int"/>
      <coluna nome="id_tb1_tb3"/>
      <coluna nome="id_tb2_tb3"/>
      <chaveprimaria coluna="//@banco.0/@tabela.2/@coluna.0"/>
      <chaveestrangeira coluna="//@banco.0/@tabela.2/@coluna.1" tabela="//@banco.0/@tabela.0"/>
      <chaveestrangeira coluna="//@banco.0/@tabela.2/@coluna.2" tabela="//@banco.0/@tabela.1"/>
    </tabela>
  </banco>
</sql:Host>
