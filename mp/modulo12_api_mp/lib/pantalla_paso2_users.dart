import 'dart:convert';
import 'package:flutter/material.dart';
import 'package:go_router/go_router.dart';
import 'package:http/http.dart' as http;

import 'todo_dto2.dart';

class PantallaPaso2Users extends StatelessWidget {
  const PantallaPaso2Users({super.key});

  Future<List<UserDto>> _fetchUsers() async {
    final res = await http.get(
      Uri.parse('https://jsonplaceholder.typicode.com/familiares?_limit=15'),
    );
    final lista = jsonDecode(res.body) as List<dynamic>;
    return lista
        .map((e) => UserDto.fromJson(e as Map<String, dynamic>))
        .toList();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Paso 2 · DTO familiares'),
        leading: BackButton(onPressed: () => context.go('/')),
      ),
      body: FutureBuilder<List<UserDto>>(
        future: _fetchUsers(),
        builder: (context, snap) {
          if (snap.connectionState != ConnectionState.done) {
            return const Center(child: CircularProgressIndicator());
          }
          if (snap.hasError) {
            return Center(child: Text('Error: ${snap.error}'));
          }

          final familiares = snap.data!;
          return Column(
            children: [
              Padding(
                padding: const EdgeInsets.all(12),
                child: Row(
                  children: [
                    Chip(
                      label: Text('${familiares.length} usuarios'),
                      backgroundColor: Colors.blue[100],
                    ),
                  ],
                ),
              ),
              Expanded(
                child: ListView.builder(
                  itemCount: familiares.length,
                  itemBuilder: (context, i) {
                    final familiar = familiares[i];
                    return ListTile(
                      title: Text(familiar.name),
                      subtitle: Text(familiar.email),
                      leading: CircleAvatar(
                        child: Text(familiar.id.toString()),
                      ),
                    );
                  },
                ),
              ),
            ],
          );
        },
      ),
    );
  }
}